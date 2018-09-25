	************************************
*****  	Description de l'application:   	*****
	************************************
� Rexam �  est une application web et mobile qui permet aux �l�ves en classe d�examen de consulter leurs r�sultats � la fin d�ann�e gr�ce � leurs Matricule. Apr�s avoir saisi le num�ro matricule les informations suivantes s�affiche :
1.	Nom et pr�nom de l��l�ve. Ex : Youssoufou Alioum
2.	Date de naissance.  Ex : 19-05-1990
3.	Lieu de naissance.  Ex : Maroua
4.	S�rie.  Ex : BACD
5.	D�cision du jury.  Ex : ADMIS ou REFUS
Toutes ces donn�es seront au pr�alable sauvegarger dans une base des donn�es par l'administrateur.
NB: pour l'instant le programme recup�re tout simplement les donn�es saisies par l'utilisitateur et affiche parce que nous n'avons pas encore fait le module 3 sur la base des donn�es.

	************************************
*****  	     Pr�-requis avant execution		*****
	************************************
Installer un jdk ou au moins un jre sur son ordinateur.
Pour l'installation merci de suivre les �tapes suivantes:

	-Rendez-vous sur la partie Java du site d�Oracle : http://www.oracle.com/technetwork/java
	-Dans la zone de droite �software downloads�, cliquez sur le lien �Java SE� (pour Java Standard Edition)
	-Cliquez sur l�ic�ne �Java� pour t�l�charger le JDK
	-Accepter la licence
	-De pr�f�rence choisir la version la plus r�cente (derni�re sur la liste)
		-si votre machine est une 64 bit, choisir le jdk dont le nom a 'windows-X64' avant le '.exe'
		-si votre machine est une 32 bit, choisir le jdk dont le nom a 'windows-i586' avant le '.exe'
		-la version 32 bit fonctionne sur un Syst�me Windows 32 bit ou 64 bit.
	-Cliquez sur le bouton �Enregistrer le fichier�. Le t�l�chargement commence
	-Double cliquez sur le fichier t�l�charg�. L�assistant d�installation du JDK se lance
	-Cliquez sur le bouton �Next� des fen�tre qui vont s'afficher
	-Au moment d�installer un environnement d�ex�cution ind�pendant du JDK, l�assistant vous consulte. Acceptez les options par d�faut et cliquez sur Next
	-Ainsi m�me si vous supprimez par la suite le r�pertoire d�installation du JDK (qui contient aussi une JRE), vous pourrez tout de m�me ex�cuter des programmes Java sur votre ordinateur
	-Vous arrivez � l��cran de fin d�installation, qui vous pr�cise que l�installation s�est bien d�roul�e 
	-Cliquez sur Close: L�installation du JDK est termin�e. 

	************************************
*****  		Version du jdk utili�		  	*****
	************************************

java version "1.8.0_144"
Java(TM) SE Runtime Environment (build 1.8.0_144-b01)
Java HotSpot(TM) Client VM (build 25.144-b01, mixed mode)



	************************************
*****  	Documentation:			  	*****
	************************************

Veuillez suivre les indications suivantes:

1) Rendez vous dans le dossier 'Livrable1\doc'.

2) Double cliquez sur 'index.html'.

	
	************************************
***** 	Execution de l'application:    		*****
	************************************

Veuillez suivre les indications suivantes:
	
1) 	A l'aide de votre interpretteur de commande (cmd.exe),
	placer vous dans le dossier o� vous avez t�l�charg�
	le fichier compress� "Rexam.jar"
	('cd [chemin]/[dossier cible]').

2)	Entrer la commande 'java -jar Rexam.jar'.