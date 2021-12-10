package org.firstinspires.ftc.ftcdevcommon;

import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ExecutionException;

public class Threading {

    // See https://stackoverflow.com/questions/43764036/how-to-convert-the-code-to-use-completablefuture
    // Use answer with 6 upvotes from Holger.
    public static <R> CompletableFuture<R> launchAsync(Callable<R> pCallable) {
        CompletableFuture<R> cf = new CompletableFuture<>();
        CompletableFuture.runAsync(() -> {
            try {
                cf.complete(pCallable.call());
            } catch (Throwable ex) {
                cf.completeExceptionally(ex);
            }
        });
        return cf;
    }

    // The description of the problem in
    // https://stackoverflow.com/questions/10437890/what-is-the-best-way-to-handle-an-executionexception
    // actually contains the best, if awkward, approach.
    public static <R> R getFutureCompletion(CompletableFuture<R> pCompletable) throws InterruptedException, IOException {
        R retVal = null;
        try {
            retVal = pCompletable.get(); // allows catch clause for CompletionException below (no compiler error)
        }
       catch (Throwable t) {
            handleFutureException(t);
        }
        return retVal;
    }

    //  Exceptions caught during the execution of a CompletableFuture are wrapped
    //  in an ExecutionException (if CompletableFuture.get() was called - our
    //  standard usage) or a CompletionException (if CompletableFuture.join() was
    //  called). In either case we must unwrap the exception and re-throw it as the
    //  original type.
    private static void handleFutureException(Throwable t) throws InterruptedException, IOException {

        if ((t instanceof ExecutionException) || (t instanceof CompletionException)) {
            t = t.getCause(); // unwrap original exception
        }

        if (t instanceof CancellationException) {
            // Benign in our environment - part of a normal shutdown
            return;
        }

        if (t instanceof InterruptedException) {
            throw (InterruptedException) t;
        }

        if (t instanceof IOException) {
            throw (IOException) t;
        }

        if (t instanceof Error) {
            throw (Error) t;
        }

        if (t instanceof RuntimeException) {
            throw (RuntimeException) t;
        }

        throw new RuntimeException(t);
    }
}
