#Kendisine gönderilen sınırsız sayıdaki parametreyi bir listeye çeviren fonks.
def doList(*params):
    liste=[]
    for param in params:
        liste.append(param)
    return liste
#Gönderilen iki sayı arasındaki tüm asal sayıları bulan fonksiyon
def asalBulan(sayi1,sayi2):
    for sayi in range(sayi1, sayi2+1):
        if sayi > 1:
            for i in range(2,sayi):
                if (sayi % i == 0):
                    break
            else:
                print(sayi)
#inputun tam bölenlerini bulan fonks.
def tamBolen(sayi):
    tamBolenList=[]

    for i in range(2, sayi+1):
        if (sayi % i == 0):
            tamBolenList.append(i)
    return tamBolenList
