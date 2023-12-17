#1-Liste elemanları içerisindeki sayısal değerleri bulunuz
#2- Kullanıcı 'q' değerini girmedikçe aldığınız her inputun sayısal değeri olduğundan emin olunuz. aksi halde hata mesajı veriniz.
#3-Girilen parola için türkçe karakter hatası veriniz
#4-Faktöriyel fonks oluşturunuz. Fonksiyonun alabileceği hatalar için hata mesajları veriniz.

#1. soru
Liste=["1","2","5a","10b","abc","10","50"]
numeric =[] 
for i in Liste:       
    try:
        a = int(i)        
        numeric.append(a)        
    except:
        continue
print(numeric) 

#2. soru
x = input('Değer giriniz')
if x !='q':
    try:
        a=int(x)
        if type(a) != int:
                print('Değer sayısal değil')
        else:
            print('Sayısal değer girdiniz')
    except ValueError as vl:
        print(f'Sayısal bir değer giriniz. Hata mesajı: {vl}')
else:
    print("büyülü harfi girdin artık geçebilirsin")

#3. soru
password = input("Parola giriniz")
import re
if re.search("[Ö,ö,Ü,ü,İ,ı,Ğ,ğ,ş,Ş,Ç,ç]",password):
    raise TypeError('Şifreniz Türkçe harf içermemelidir.')
else:
    print('Parolanız Oluşturulmuştur.')

print(f'Parolanız: {password}')

#4. soru
def faktoriyel(x):
    try:    
        if x<0:
            raise ValueError("Negatif sayıların faktöriyeli alınmaz.")
        
        elif x == 0 or x == 1:
            return 1
        else:
            return x * faktoriyel(x - 1)
    except Exception as hata:
        print(hata)
        
