from django.contrib import admin
from .models import Movie

class MovieAdmin(admin.ModelAdmin):
    list_display =("id","name","created_date","isPublished") #admin panelinde bu üç bilgi ile sütunlar oluşacak. Filmler öyle görünecek.
    list_display_links = ("id","name") #Seçili elemanlara link özelliği eklemek
    list_filter =("created_date",) #seçili özelliğe göre filtreleme özelliği sunacak. virgülü bilerek koyduk
    list_editable = ("isPublished",) #admin panelinde yayınlayıp yayınlamama özelliği sunacak.
    search_fields = ('name','description') #admin panelinde arama yapmamızı sağlayacak
    list_per_page = 20 #her sayfada 20 içerik görünecek.

admin.site.register(Movie,MovieAdmin)