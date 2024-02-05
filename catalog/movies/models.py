from django.db import models

class Movie(models.Model):
    name = models.CharField(max_length=100,verbose_name="Film Adı") 
    description = models.TextField(verbose_name="Film Açıklaması")
    image = models.CharField(max_length=50,verbose_name="Film Görseli")  
    created_date = models.DateTimeField(verbose_name="Filmin oluşturulma tarihi") #panelde görülecek isimler bunlar.
    isPublished = models.BooleanField(default=True) #buraya her bir ekleme yaptıktan sonra makemigrations yap

    def __str__(self):
        return self.name #bu kod ile admin panelinde modellerin ismi name parametresi olarak görülecek.
    
    def get_image_path(self):
        return '/img/'+self.image #list.html sayfasında img yolunu oluşturmak için yaptık
