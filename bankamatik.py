omerHesap = {
    'hesapNo' : '121213',
    'ad': 'omer',
    'bakiye' : 2000,
    'ekHesap' : 1000
}
def bakiyeSorgula(hesap):
    print(f"Merhaba {hesap['hesapNo']} No'lu hesabınızda {hesap['bakiye']} lira vardır.")


def paraCek(hesap,miktar):
    paraCekmeDurumu = str(input("Para çekmek istiyor musunuz (Evet/Hayır)"))
    if paraCekmeDurumu=="Evet":
        print("Girdiğiniz miktar kadar paranız gönderiliyor")
        if miktar < hesap["bakiye"]:
            hesap['bakiye'] -= miktar
            print("Paranız gönderilmiştir...")
            print(f"Yeni bakiyeniz: {hesap['bakiye']}")

        else: 
            print("Hesabınızda yeterli bakiye bulunmamaktadır.")
            ekHesapKullanımı = str(input("Ek hesabınızı kullanmak ister misiniz(Evet/Hayır)"))        
            if ekHesapKullanımı == "Evet":
                toplam = hesap['bakiye'] + hesap['ekHesap']
                print(f"Toplam bakiyeniz: {toplam}")
                if miktar > toplam:
                    print("Üzgünüz yeterli bakiyeniz bulunmamaktadır")
                
                else:
                    sonToplam = toplam - miktar
                    hesap['bakiye']=0
                    print("Paranız gönderiliyor...")
                    print(f"Ek hesabınızda kalan miktar: {sonToplam}")
        
    else:
        print("İyi günler dileriz")
            
    
bakiyeSorgula(omerHesap)
paraCek(omerHesap,2500)
