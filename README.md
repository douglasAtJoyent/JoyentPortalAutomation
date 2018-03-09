# JoyentPortalAutomation
This is a selenium framework used to test the end user portal.


Recommended Prerequisites : 
   Eclipse: https://www.eclipse.org/
      
      Plugins : 
           For these, you may want to goto Help -> Eclipse Marketplace and then search for each of these, if you can not find it or are not sure you can use the install URL by going to Help->Install New Software, and add the
           url listed, 
        1. Cucumber Plugin - http://cucumber.github.com/cucumber-eclipse/update-site
        2. Git integration for Eclipse	4.8.0.201706111038-r	org.eclipse.egit.feature.group	Eclipse EGit
        3. m2e  http://download.eclipse.org/technology/m2e/releases/ 
      The maven plugin may already be included in Eclipse, so you may not have to install it. I put it in this list just in case.
      Also note : you may need maven on your machine already. If you do need it, you can find it https://maven.apache.org/download.cgi
       
   To start using Eclipse with the plugins : 
   
     Now you have Eclipse you need to get the code base. The easiest way is : 
       1. Goto File->Import
       2. From this list choose git,
       3. Clone from URI
       4. In the  URL put "https://github.com/douglasAtJoyent/JoyentPortalAutomation". 
       5. Select the branch Master, there are no other branches yet.
       6. Finally select the location you want to install to. 
     This should setup the project and you should be good to go. 
