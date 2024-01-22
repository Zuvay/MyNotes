import matplotlib.pyplot as plt
import numpy as np

x = np.linspace(-9,10,20)
y = x ** 3
z = x ** 2

#ÖRNEK 1-
figure = plt.figure()
axes_cube = figure.add_axes([0.1,0.1,0.8,0.8]) #Sırasıyla soldan ve sağdan 10 da 1 kaydırılmış, genişlik ve yükseklik olarak da 10 da 8 kaydırılmış

axes_cube.plot(x,y,'b')
axes_cube.set_title("Küp")

axes_square = figure.add_axes([0.15,0.6,0.25,0.25]) #aynı kaydırma işlemini daha çok yaparak figure içerisinde diğer tablonun içinde olmasını sağladık
axes_square.plot(x,z,'r')
axes_square.set_title("Kare")

plt.show()

#ÖRNEK 2-
figure = plt.figure()

axes = figure.add_axes([0,0,1,1])

axes.plot(x,z,label="Square")
axes.plot(x,y,label="Cube")
axes.legend(loc=4)


fig,axes = plt.subplots(nrows=2,ncols=1,figsize=(8,8))

axes[0].plot(x,y)
axes[0].set_title("Cube")
axes[1].plot(x,z)
axes[1].set_title("Square")

plt.tight_layout()

#Tabloyu kaydetmek için
fig.savefig("figure2.pdf")

plt.show()
