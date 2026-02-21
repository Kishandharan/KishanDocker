# Dockerizing an application (Can be built with anything)
This README explains how to Dockerize an app and make it run ANYWHERE🚀🚀.    
In this tutorial, we will be Dockerizing a python app just because it is easy to prototype🎯.    
Note: You can dockerize ANYTHINIG. We are using python just for an example.

## Prerequisites
Here are the things that you have to have ready already😊:
- 🎯Latest Docker
- 🎯Latest Python
- 🎯Some knowledge on Python (Would help, but totally optional)
- 🎯Docker Hub Account

## Let's Start🎊
With the prerequisites ready, let us start DOCKERIZING🎊🥳.

### 🎯Step1: Isolating app
Although you can keep it anywhere, I recommend keeping a dedicated folder for your Docker apps✅✅😊.           
So, create the following directories and files (Can create anywhere, but I recommend your Home Folder. ~ represents Home Folder):               
```
~
|
|-- Docker
    |-- app.py
    |-- Dockerfile
```
If you have a dedicated folder where you have multiple directories for saving different language projects,     
Then I also recommend placing this Docker directory under that dedicated folder😊😊.                                 
The Dockerfile is a file that tells docker how to build the Image containing our app🎊✅.
And the app.py file is the file that contains the code for our Python example. That is what we are going to Dockerize.
While the name "Dockerfile" is a must, the "app.py" can have any name ending with ".py" instead of "app.py"!

### 🎯Step2: Coding the Example
Now, we can start ACTUALLY writing the python code😊.                                              
Paste the following inside your python file:                     
```
def greet(name):
    print("Hello,", name)
for i in range(0, 10, 1):
    greet("Docker")
```
This code just prints "Hello, Docker" 10 times✅, pretty simple🎊🥳🚀.                  
You can also run the code and test it yourselves if you want😊.

### 🎯Step3: Writing Dockerfile Instructions🤖
This is where it gets really interesting🚀🚀.    
Docker instructions basically means telling Docker how to build your image with your code😊.    
For our example, paste this into your Dockerfile:
```
FROM ubuntu:latest
WORKDIR /app
RUN apt update --yes
RUN apt upgrade --yes
RUN apt install python3 --yes
COPY . .
CMD ["python3", "app.py"]
```
This Dockerfile has 7 instructions🚀.       

__Instruction1__: The first instruction says "FROM ubuntu:latest". This pulls the latest ubuntu image from Docker Hub to start with.
__Instruction2__: The second instruction says "WORKDIR /app". This sets the current working directory in the image to be /app.
__Instruction3__: The third instruction says "RUN apt update --yes". This runs the command "apt update --yes" inside the image.
__Instruction4__: The fourth instruction says "RUN apt upgrade --yes". This runs the command "apt upgrade --yes" inside the image.
__Instruction5__: The third instruction says "RUN apt install python3 --yes". This runs the command "apt install python3 --yes" inside the image.
__Instruction6__: The third instruction says "COPY . .". This copies all our code into the current working directory inside the image.
__Instruction7__: The third instruction says "CMD ["python3", "app.py"]". This runs the command "python3 app.py" inside the container when running.

### 🎯Step4: Building the image
Now we are getting into the MOST INTERESTING PART🚀🥳🎊🚀😊.    
Run the follwing command in your terminal (In the directory of your project):
```
docker build -t username/imagename:latest .
```
Replace username with your Docker Hub User Name, and imagename with whatever name you like😊😊.           
The entire "username/imagename:latest" part is the name of the image and the "." tells docker that                      
the current directory is our project. If you passed this step, congrats! You have just Dockerized your app🚀🚀🤖🥳🎊!!            

### 🎯Step5: Test your image
Now, to check whether your image is working or not, run:
```
docker run username/imagename:latest
```
Replace username with your Docker Hub Username and replace imagename with whatever you set in Step4.

### 🎯Step6: Pushing image to Docker Hub
We are now going to make the image you built, public🥳🎊🚀🚀!!               
To do this, first make sure you are logged in by running in your terminal "docker login", which takes you through login steps.               
After that, to push your image, run the following:
```
docker push username/imagename:latest 
```
Replace username with the your Docker Hub Username. And replace imagename with whatever you set in Step4.               
If this executes successfully, you have successfully published your app in Docker Hub!!!
