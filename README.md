maven-war-overlay-dependencies
==============================

Maven War Overlay Dependencies Example

The aim of this project is to show how we can add Maven web application project called 'project-master' 
to another Maven web application project called 'proejct-child'. Both of those projects have war type packaging.

Java dosen't see .war as a classpath, w'ill use 'maven-war-plugin' to create .jar and .war of 'project-master' 
and included it as a dependency to 'project-child'.

finaly, w'll use maven-shade-plugin' to crate an uber war of 'project-child'.
