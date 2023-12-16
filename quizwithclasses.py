class Question:
    def __init__(self,text,choice,answer):
        self.text = text
        self.choice = choice
        self.answer = answer
    
    def checkAnswer(self,answer):
        return self.answer==answer #kullanıcının girdiği answer ile initteki answeri karşılaştırıp True döndüreceğim demek.
    
class Quiz:
    def __init__(self,quesitons):
        self.questions = quesitons
        self.score = 0
        self.questionIndex = 0
    
    def getQuestion(self):
        return self.questions[self.questionIndex]
    
    def displayQuestion(self):
        question=self.getQuestion()
        print(f'Soru {self.questionIndex + 1}  {question.text}')

        for q in question.choice:
            print('-'+q)
        
        answer = input("Cevabınız: ")
        self.guess(answer)
        self.loadQuestion()
    
    def guess(self,answer):
        question = self.getQuestion()

        if question.checkAnswer(answer):
            self.score += 1
        self.questionIndex +=1

        
    
    def loadQuestion(self):
        if len(self.questions) == self.questionIndex:
            self.showScore()
        else:
            self.displayProgress()
            self.displayQuestion()
    
    def showScore(self):
        print(f'Skorunuz: {self.score}')

    def displayProgress(self):
        totalQuestion = len(self.questions)
        currentQuestion = self.questionIndex + 1

        if currentQuestion > totalQuestion:
            print("Quiz bitti")
        else:
            print(f'{totalQuestion} adet sorudan {currentQuestion}. sorudasınız')
        

q1=Question('en iyi programlama dili hangisidir',['C#','python','javascript','java'],'python')
q2=Question('en kolay programlama dili hangisidir',['C#','python','javascript','java'],'python')
q3=Question('en çok kazandıran programlama dili hangisidir',['C#','python','javascript','java'],'python')

questions=[q1,q2,q3]
quiz=Quiz(questions)

quiz.loadQuestion()
