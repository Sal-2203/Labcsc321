#Saul Zuniga

def rectriangle(base, height):

    area = base * height
    return area

def circle(rad):

    area1 = rad * 2 * 3.14
    return area1

x = int(input("Enter the base of the rectriangle :" ))
y = int(input("Enter the height of the rectriangle :" ))

recArea = rectriangle(x,y)

print("The area of the triangle is ", rectriangle(x,y))

r = int(input("Enter the radius of the circle :" ))

print("The area of the circle is ", circle(r))
