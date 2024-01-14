import pandas as pd 
df = pd.read_csv("imdb.csv")
#Tüm kolonları görmek için df.columns

# 1-Dosya hakkındaki bilgiler
result = df
# 2- İlk 5 kaydı gösterin
result= df.head() #default halinde 5 kaydı alır. Paranteze girilen değişken kadar en baştan row çıkarır
# 3- son 5 kaydı gösterin
result = df.tail()
# 4- sadece belirli bir kolonu alın
result = df["Title"]
# 5- sadece belirli kolonun ilk 5 kaydını alın
result = df["Title"].head()
# 6- seçtiğiniz iki kolonun ikinci 10 kaydını alın
result = df[["Title","Production"]].head(10)
# 7- seçtiğiniz iki kolonun Yayın tarihi 2000-2010 olan filmlerin ilk 10'unu alın
result = df[(df["Year"] > 2000) & (df["Year"] < 2010)]["Title"].head(10)
# 8- imdb puanı 8den yüksek ilk 10 kayıt
result = df[df["imdbRating"]>=8][["Title","Production"]]

print(result)
