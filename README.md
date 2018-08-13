# Model Based Testing for Smart Devices

PARAMETROS (.jar)


-S Especificar sistema

    A Android
    
    I iOS
    
    B Ambos


-D Especificar dispositivos donde se va a ejecutar test

    A Todos los dispositivos conectados
    
    id1,id2,... Especificar dispositivos por ID (chequear dispositivos con "adb devices")


-T Ruta donde se encuentra archivo test

    pathTestFile


-M Especificar Main Object

    mainObjectName


-N ScreenShot (por defecto No)

    S Si
    
    N No
	
	
-PA Package Android

    package


-RA Ruta donde se aloja proyecto Android

    pathAndroidProject
    

-RI Ruta de la Mac donde se aloja proyecto iOS

    pathIOSProjectInMac
    

-CA Especificar si se desea copiar proyecto Android (por defecto Si)

    S Si
    
    N No
    

Parametros obligatorios

 -S,-D,-T,-M
 
 
 Si se espcifico sistema Ambos, parametros requeridos
 
-PA, -RI, -RA


Si se espcifico sistema Android, parametros requeridos

-PA, -RA


Si se espcifico sistema iOS, parametros requeridos

-RI



Parametros opcionales

-N, -CA


Commands:


back

tap("control")

longTap("control")

doubleTap("control")

swipeDown

swipeUp

swipeLeft

swipeRight

fill("control", "texto")

editDate("control", "dia", "mes", "año")

editTime("control", "hora", "minuto")

isDisplayed("control")

isCompletelyDisplayed("control")

hasFocus("control")

isEnabled("control")

isClickable("control")

validate("control", "texto")

listTap("control", "posicion")

listScroll("control", "posicion")

listInsert

listCancel

listSave

listSearch("texto de busqueda")

listDelete("posicion")

listUpdate("posicion")

go("panel")
