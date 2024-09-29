import pyautogui as pg
import time

imageOffset = 25
ligado = 1
espera = 1.5

def checkImage():
    try:
        pos = pg.locateOnScreen("./ferro 1.png", confidence=0.8)
        pg.moveTo(pos[0] + imageOffset, pos[1] + imageOffset)
        pg.click()
        time.sleep(espera)
    except:
        print("ferro1 em espera")
    
    try:
        pos = pg.locateOnScreen("./ferro 2.png", confidence=0.8)
        pg.moveTo(pos[0] + imageOffset, pos[1] + imageOffset)
        pg.click()
        time.sleep(espera)
    except:
        print("ferro2 em espera")
    
    try:
        pos = pg.locateOnScreen("./ferro 3.png", confidence=0.8)
        pg.moveTo(pos[0] + imageOffset, pos[1] + imageOffset)
        pg.click()
        time.sleep(espera)
    except:
        print("ferro3 em espera")
    
    ## ferro 4 ta com erro fazer dnv
    
    try:
        pos = pg.locateOnScreen("./ferro 5.png", confidence=0.8)
        pg.moveTo(pos[0] + imageOffset, pos[1] + imageOffset)
        pg.click()
        time.sleep(espera)
    except:
        print("ferro5 em espera")
    try:
        pos = pg.locateOnScreen("./ferro 6.png", confidence=0.8)
        pg.moveTo(pos[0] + imageOffset, pos[1] + imageOffset)
        pg.click()
        time.sleep(espera)
    except:
        print("ferro6 em espera")
    try:
        pos = pg.locateOnScreen("./ferro 7.png", confidence=0.8)
        pg.moveTo(pos[0] + imageOffset, pos[1] + imageOffset)
        pg.click()
        time.sleep(espera)
    except:
        print("ferro7 em espera")
    try:
        pos = pg.locateOnScreen("./ferro 8.png", confidence=0.8)
        pg.moveTo(pos[0] + imageOffset, pos[1] + imageOffset)
        pg.click()
        time.sleep(espera)
    except:
        print("ferro8 em espera")
    try:
        pos = pg.locateOnScreen("./ferro 9.png", confidence=0.8)
        pg.moveTo(pos[0] + imageOffset, pos[1] + imageOffset)
        pg.click()
        time.sleep(espera)
    except:
        print("ferro9 em espera")
    

while ligado == 1:
    checkImage()
