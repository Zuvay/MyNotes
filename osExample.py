import os
#dizin değiştirme
os.chdir("C://") #c dizinine geç
os.chdir("../..") #iki üst dizine geç. Yalnızca iki nokta olsa bir üst dizine geçecekti

#klasör oluşturma
os.mkdir("newdirectory") # mevcut dizine şu isimde bir klasör oluşturma
os.makedirs("newdirectory/yenikalsor") # / işaretinden sonra o klasörün içine de bir klasör oluşturuyoruz.

#mevcut dizini öğrenmek
print(os.getcwd())

# mevcut dizindeki dosyaları liste halinde görmek için
result = os.listdir() # mevcut konumdakini
result = os.listdir("C://") #c dizinindekini 
for i in os.listdir():
    if i.endswith(".py"):
        print(i) # bu metod ile de listeleme yaparken filtreleme yapabiliriz.

# os.stat("dosya adı") ile dosyanın çeşitli özelliklerine ulaşırız. Bu özellikleri datetime modülü ile çözebiliriz (son değiştirme tarihi, boyutu vs.)

#os.system("notepad.exe") ile yazdığımız programı çalıştırır. Burada notepad açacak bir tane.

#path sınıfı ile ismi verilen bir dosyanın tam konumu bulunabilir.
result = os.path.dirname(os.path.abspath("osExample.py")) # içteki dosyanın konumunu verecektir. Dıştaki de dizindeki yerini gösteriyor. Sonuç olarak bu kod ile dosyanın bilgisayardaki uzantısına ulaşabiliyoruz.



