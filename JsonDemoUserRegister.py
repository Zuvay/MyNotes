import json
import os

class User:
    def __init__(self,username,password,email):
        self.username=username
        self.password=password
        self.email=email

class UserRepository:
    def __init__(self):
        self.users = []
        self.isLoggedIn = False
        self.currentUser = {}

        #Load user from .json file
        self.loadUsers()
    
    def loadUsers(self):
        if os.path.exists('users.json'):
            with open ('users.json','r',encoding='utf-8') as file:
                users = json.load(file) #json dosyasından okuma işlemi
                for user in users:
                    user = json.loads(user)
                    newUser = User(username=user['username'],password=user['password'],email=user['email']) #buradan elde ettiğimiz user değişkenini classımıza uygun hale getirdik
                    self.users.append(newUser) #ve repordaki users listesine atamış olduk
            print(self.users)
            
    
    def register(self, user: User): #user:User user isminde bir bilgi gelecek ve tipi User olacak. User bizim classımız
        self.users.append(user) #self.users initte tanımlandı
        self.saveToFile()
        print("Kullanıcı Oluşturuldu")
    
    def login(self,username,password):
        if user.username == username and user.password==password:
            self.isLoggedIn = True
            self.currentUser = user
            print('Giriş yapıldı')
        else:
            print("Hatalı bilgi girdiniz")
    def logOut(self):
        self.isLoggedIn = False
        self.currentUser = {}
        print('Çıkış yapıldı')

    def identity(self):
        if self.isLoggedIn:
            print(f'username: {repository.currentUser.username}')
        else:
            print('Giriş yapılmadı')
    
    def saveToFile(self):
        liste = []

        for user in self.users:
            liste.append(json.dumps(user.__dict__)) #self.users bilgisini json formatına dönüştürdük.
        
        with open("users.json","w") as file:
            json.dump(liste,file) # listeyi json dosyasına gönderdik

repository = UserRepository()

while True:
    print('MENÜ'.center(50,'*'))
    secim = input("1- Register\n2- Login\n3- Logout\n4- identity\n5- Exit\n ")
    if secim == '5':
        break
    else:
        if secim=='1':
            username = input("username: ")
            password = input("password: ")
            email = input("email: ")
        
            user = User(username=username,password=password,email=email)
            repository.register(user)
        elif secim=='2':
            if repository.isLoggedIn:
                print("Zaten giriş yapılmış")
            else:
                username = input("username: ")
                password = input("password: ")

                repository.login(username,password)
        elif secim=='3':
            repository.logOut()

        elif secim=='4':
            repository.identity()


            
