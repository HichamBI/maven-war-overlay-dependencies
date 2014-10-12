maven-war-overlay-dependencies
==============================

Maven War Overlay Dependencies Example

The aim of this project is to show how we can add Maven web application project called 'project-master' 
to another Maven web application project called 'proejct-child'. Both of those projects have war type packaging.

Java doses not see .war as a classpath, we'll use 'maven-war-plugin' to create .jar and .war of 'project-master' 
and included it as a dependency to 'project-child'.

Finally, we'll use maven-shade-plugin' to crate an uber war of 'project-child'.
