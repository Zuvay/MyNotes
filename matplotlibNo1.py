import numpy as np
import pandas as pd
import matplotlib.pyplot as plt

# ÖRNEK -1
a = [1, 2, 3, 4, 5]
b = [1, 8, 27, 64, 125]

plt.plot(a, b, "o--r") #a değerine karşılık gelen b değerlerini göstermiş oluyoruz
                #o -- r , marker, line ve color biçimlendirmesi yapabiliyoruz. Detayları dökümantasyondan bak
plt.title('Çizgi Grafiği')
plt.xlabel('X Ekseni')
plt.ylabel('Y Ekseni')

# X ekseninde 0'dan 5'ya kadar olan bir aralığı göster
# Y ekseninde 0'dan 125'ye kadar olan bir aralığı göster
plt.axis([0, 5, 0, 125]) #bununla eksenlerin aralıklarını belirleyebiliyoruz. 

plt.show()


# ÖRNEK -2
x = np.linspace(0,2,20)
plt.axis('auto')

plt.plot(x,x,label="düz")
plt.plot(x,x**2,label="kare")
plt.plot(x,x**3,label="küp")

plt.legend() #lejantı oluşturduk. İsimlerini yukarıda label ile verdik.

plt.xlabel("X aksisine verilen isim")
plt.ylabel("y aksisine verilen isim")
plt.title("Grafiğin başlığı")
plt.show()

#Aynı ekranda birden fazla tablo oluşturmak için plt.subplots(tablo miktarı)

# ÖRNEK -3
x = np.linspace(0,1,300)
fig,axs = plt.subplots(3)
fig.suptitle("Total tablonun başlığı")

axs[0].plot(x, x,)
axs[0].set_title("linear")

axs[1].plot(x, x**2,)
axs[1].set_title("kare")

axs[2].plot(x, x**3,)
axs[2].set_title("küp")

plt.show()



#ÖRNEK -4
df = pd.read_csv("nba.csv")


grafikteOlacaklar = ["Team","Age", "Salary", "Weight"]

secilen = df[grafikteOlacaklar]

secilen = secilen.groupby(["Team"]).mean()

secilen.plot(subplots=True,legend=True)
plt.axis('auto')
plt.legend()
plt.show()
