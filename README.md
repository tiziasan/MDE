# Model Driven Engineering Project

# Description
This repository contains four metamodels and two models, the metamodels are:/n
-Family, that describes the structure of a family.
-Webapp, the describes the structure of a simply web application.
-Editor, that describes the structure of a 'drawing program'.
-Match, metamodel created by the binding of the three above.
The models are editorSelector that refer to Editor and match that refer to the match metamodel
The Java program take the Family and Webapp metamodels and counts how many attributes we have and their type foreach metaclass and then check on the model editorSelector if some context can represent a metaclass. 
Then we create a new model based on Match metamodel where foreach match we have a reference to the metaclass and a list of context



# How to run
To run the project just clone the repository and run the Main in the folder it.univaq.disim.mde.matchingplugin/src/it/univaq/disim/mde/matchingplugin as java application.  

