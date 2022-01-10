set projectLocation=C:\Users\tamat\eclipse-workspace\JobGuarentee
cd %projectLocation%
set classpath=%projectlocation%bin;%projectlocation%\lib\*
java org.testng.TestNG %projectlocation%\testNG.xml
pause