import requests
import json

apiKey ="2bdff984ded194ecb113ca98" #may expired
apiUrl ="https://v6.exchangerate-api.com/v6/2bdff984ded194ecb113ca98/latest/" #may expired

bozulanDoviz = input("Bozdurulacak Döviz Türü: ") #örneğin USD
alinacakDoviz = input("Alınacak Döviz Türü: ") #örneğin TRY
miktar = int(input(f"Ne kadar {bozulanDoviz} bozdurmak istiyorsunuz: "))

sitedenAl = requests.get(apiUrl + bozulanDoviz) #ilgili url'nin sonunda girilen döviz miktarına göre çıkacak çıktıları alıyoruz
sonuc =json.loads(sitedenAl.text) #aldığımız çıktının yalnızca text kısmını istedik ve json ile dict e dönüştürdük

conversion_rates = sonuc['conversion_rates']
mevcutKur = f"1 {bozulanDoviz}: {conversion_rates[alinacakDoviz]} {alinacakDoviz}"
donusturulenMiktar = miktar * conversion_rates.get(alinacakDoviz)
print(mevcutKur)
print(f"Dönüştürülüen miktar: {donusturulenMiktar} {alinacakDoviz}")
