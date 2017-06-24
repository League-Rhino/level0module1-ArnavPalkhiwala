int x = 250;
int y = 250;
int xpipe = 1000;
int ypipe = 500;
double birdYVelocity= -100;
double gravity = 5;
void setup(){
size(1000,1000);
background(20,30,90);}
void draw(){
background(20,30,90);
 ellipse(x,y,125,125);
fill(70,20,19);
rect (xpipe, ypipe, 200, 400); 
xpipe-= 25;
if(xpipe <= 0){
xpipe = 1000;}
int rand = (int) random (100,400);
y += gravity;
}
void mousePressed(){
y += birdYVelocity;}