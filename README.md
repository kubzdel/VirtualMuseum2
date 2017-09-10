# VirtualMuseum
## Configuring project
1. Set src project dir as a source root.
2. Add lwjgl jar's:
	- go to File -> Project Structure -> Modules -> Dependencies
	- add JARs or directories...
		- lwjgl.jar
		- lwjgl_util.jar
3. Add new configuration:
	- set main class as "Main.Main"
	- add VM options "-Djava.library.path=lib/"
	- set JRE
4. Set SDK:
	- go to File -> Project Structure -> Project
	- set SDK and create output dir (Project compiler output)
5. Run configuration.

Issues:
  - "Error:java: invalid source release: 1.9"
    - go to File -> Project Structure -> Project
    - set "Project Language Level" to lower one

Based on:
 - http://wiki.lwjgl.org/wiki/Setting_Up_LWJGL_with_IntelliJ_IDEA.html
