This project is the home of the utilities
that are common to all IntelliJ projects.

This project builds a jar file (with a version
number) that can then be loaded in any IntelliJ
project.

There is an analagous project for Android. The two
projects both have copies of the same source
code - and so must be kept in sync - except
for the subdirectories IntelliJ and Android,
each of which contains platform-specific methods
of getting the current working directory.

The Android subdirectory also has three source
files that are specific to UVC camera support.