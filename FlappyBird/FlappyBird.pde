int x = 100;
int y = 100;
int birdYVelocity = 30;
void setup(){
size(600, 600);
}

void draw(){
background(0, 255, 0);
fill(0,0,255);
stroke(255, 0, 0);
ellipse(x, y, 100, 100);
y+= 4;
}
