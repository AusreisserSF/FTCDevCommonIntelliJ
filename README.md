This project is the home of the utilities
that are common to all IntelliJ projects.

This project builds a jar file (with a version
number) that can then be loaded in any IntelliJ
project.

There is an analogous project for Android. The two
projects both have copies of some of the same source
code files and so must be kept in sync. However, the
subdirectories IntelliJ and Android
each contain platform-specific methods.

To create a jar file in FTCDevCommonIntelliJ follow these steps:

Under Project Structure ... Artifacts delete the current jar - renaming does not
work.

Then create a new empty jar with the correct name, e.g. ftcdevcommon_2_4
Set the correct Output directory, e.g. ftcdevcommon_2_4_jar
Make sure to check the box to "Include in project build"

On the right-hand side under Available Elements double click on ftcdevcommon
(click on ? for guidance)
** If you don't do this step then the jar file will not be built **

Run the project. The new jar file should appear in this folder:
C:\IdeaProjects\FTCDevCommonIntelliJ\out\artifacts.

See the screenshots in C:\Users\lonep\OneDrive\Documents\FTC\IntelliJ Projects\IntelliJ - create jar.