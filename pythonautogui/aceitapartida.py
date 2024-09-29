import pyautogui as pg
import time

#variaveis  e Interruptores.
imageOffset = 25
buscaPartida = 1
clicaSearch1 = 0
digitaBoneco = 'Brand'
selecionaBoneco = 0
clicaSearch2 = 0
digitaBan = 'Soraka'
selecionaBanBoneco = 0
baneBoneco = 0
pickarBoneco = 0
espera = 1.5

def aceitaQueue():
    global buscaPartida, clicaSearch1
    try:
        pos = pg.locateOnScreen("./print aceita.png", confidence=0.8)
        pg.moveTo(pos[0] + imageOffset, pos[1] + imageOffset)
        pg.click()
        time.sleep(espera)
        print("Partida Aceita")
        clicaSearch1 = 1
        buscaPartida = 0
        
    except:
        print("Em queue")

def digitaSelecaoPick():
    global buscaPartida, clicaSearch1, selecionaBoneco
    try:
        pos = pg.locateOnScreen("./searchbar.png", confidence=0.8)
        pg.moveTo(pos[0] + imageOffset, pos[1] + imageOffset)
        pg.click()
        pg.typewrite(digitaBoneco)
        time.sleep(espera)
        print("Boneco a ser Selecionado Digitado")
        selecionaBoneco = 1
        clicaSearch1 = 0
        buscaPartida = 0
        
    except:
        print(" Em espera para Digitar o Boneco a Ser Selecionado")

def selecionarbonecao():
        global buscaPartida, clicaSearch1, selecionaBoneco, clicaSearch2
        try:
            pos = pg.locateOnScreen("./icone brand.png", confidence=0.8)
            pg.moveTo(pos[0] + imageOffset, pos[1] + imageOffset)
            pg.click()
            time.sleep(espera)
            print("Boneco Selecionado")
            clicaSearch2 = 1
            buscaPartida = 0
            selecionaBoneco = 0
            clicaSearch1 = 0
            time.sleep(15.0)
        except:
            print("Em processo Selecionar Boneco")

def digitaSelecaoBan():
    global buscaPartida, clicaSearch1, selecionaBoneco,clicaSearch2, selecionaBanBoneco
    try:
        pos = pg.locateOnScreen("./searchbar.png", confidence=0.8)
        pg.moveTo(pos[0] + imageOffset, pos[1] + imageOffset)
        pg.click()
        pg.typewrite(digitaBan)
        time.sleep(espera)
        print("Boneco a ser Banido Digitado")
        selecionaBanBoneco = 1
        clicaSearch2 = 0
        selecionaBoneco = 0
        clicaSearch1 = 0
        buscaPartida = 0
        
    except:
        print(" Em espera para Digitar o Boneco a Ser Banido")
     

def selecionaBan():
        global buscaPartida, selecionaBoneco, selecionaBanBoneco, baneBoneco, clicaSearch2, clicaSearch1
        try:
            pos = pg.locateOnScreen("./icone soraka.png", confidence=0.8)
            pg.moveTo(pos[0] + imageOffset, pos[1] + imageOffset)
            pg.click()
            time.sleep(espera)
            print("Ban selecionado")
            baneBoneco = 1
            buscaPartida = 0
            selecionaBoneco = 0
            selecionaBanBoneco = 0
            clicaSearch2 = 0
            clicaSearch1 = 0
            
        except:
            print("Em processo de Selecionar Ban")

def banirBonecao():
        try:
            global buscaPartida, selecionaBoneco, selecionaBanBoneco, baneBoneco, pickarBoneco, clicaSearch2, clicaSearch1
            pos = pg.locateOnScreen("./print banir.png", confidence=0.8)
            pg.moveTo(pos[0] + imageOffset, pos[1] + imageOffset)
            pg.click()
            time.sleep(espera)
            print("Boneco Banido")
            pickarBoneco = 1
            buscaPartida = 0
            selecionaBoneco = 0
            selecionaBanBoneco = 0
            baneBoneco = 0
            clicaSearch2 = 0
            clicaSearch1 = 0
            
        except:
            print("Em processo de Banir Boneco")

def pickaBonecao():
        global buscaPartida, selecionaBanBoneco, baneBoneco, selecionaBoneco, pickarBoneco, clicaSearch2, clicaSearch1
        try:
            pos = pg.locateOnScreen("./botao Picka.png", confidence=0.8)
            pg.moveTo(pos[0] + imageOffset, pos[1] + imageOffset)
            pg.click()
            time.sleep(espera)
            print("Boneco Pickado")
            buscaPartida = 0
            selecionaBanBoneco = 0
            baneBoneco = 0
            selecionaBoneco = 0
            pickarBoneco = 0
            clicaSearch2 = 0
            clicaSearch1 = 0
        except:
            print("Em processo Pickar Boneco")

    
while buscaPartida == 1:
    aceitaQueue()

while clicaSearch1 == 1:
    digitaSelecaoPick()

while selecionaBoneco == 1:
    selecionarbonecao()

while clicaSearch2 == 1:
    digitaSelecaoBan()

while selecionaBanBoneco == 1:
     selecionaBan()

while baneBoneco == 1:
     banirBonecao()

while pickarBoneco == 1:
     pickaBonecao()

#pg.typewrite("Soraka")  # funcao pra digitar na search bar, implementar na proxima att

