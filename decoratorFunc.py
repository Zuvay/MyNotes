#Fonksiyonların hepsinde aynı işlemleri yaptırmaktansa bu işlemi yapan başka bir fonksiyon oluşturup
#diğer fonksiyonları bu fonksiyon içinde çalıştırıyoruz
import time
import math
def calculate_time(func):
    def inner(*args,**kwargs):
        start = time.time()
        time.sleep(1)
        func(*args,**kwargs) #diğer fonksiyonlarımızı burada çalıştırmış olacağız
        finish = time.time()
        print("Fonksiyon " +func.__name__ + " " + str(finish-start)+" saniye sürdü")
    return inner

@calculate_time #bu yazım sayesinde fonksiyonların hangi fonksiyonun altında çalışacağını söylemiş oluyoruz hızlıca
def usalma(a,b):
    print(math.pow(a,b))
    return usalma
@calculate_time 
def toplama(a,b):
    return a+b
@calculate_time 
def faktoriyel(num):
    print(math.factorial(num))

print(usalma(99,29))
print(toplama(100,565))
