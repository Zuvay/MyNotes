from django.urls import path
from . import views

#http://127.0.0.1:8000/
#buraya yazdığımız url'leri views ile bağlamamız lazım ki sayfaya gitsin.
urlpatterns = [
    path('', views.index, name='index'),
    path('about', views.about, name='about')
]