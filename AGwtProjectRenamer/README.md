DESCRIPTION
-----------

An ant build file that renames GWT projects, including its references in the host HTML, module XML file etc.
 
- Should work very well at least on the provided "AGwtTemplate" project (and similar template projects
  you may want to create).

- For many other GWT projects, it should also work, but it may not be perfect: As it doesn't really
  parse the files (it's just a simple search and replace!) , it could ccasionally replace the wrong thing.
  So please double-check, after you run the renamer!
  
  
USAGE
-----

Step 1: Copy `build.properties.example` to `build.properties`, and adjust the module name, your directories, etc.

Step 2: Run `ant rename-after-copy`.

Step 3 (for Eclipse users only): Choose `New > Project... > General > Project`, then

- if you created the renamed project directly in your workspace directory, just type in the *exact*
  project name of the renamed project, and Eclipse will find and set up the project automatically.
          
- if you created the renamed project somewhere else, then 
  uncheck `Use default location`, and navigate to the renamed project.

### Inplace project renaming
        
To rename a project without copying it, you can use `ant rename-inplace` 
instead of `ant rename-after-copy` (if you dare).

LICENSE
-------

AGwtProjectRenamer is published under the Apache License, Version 2.0, see the parent project (chris-gwt-utils)'s 
README and LICENSE.
