int x = 148;
int y = 400;
int bv = 40;
int g = 2;
int px = 400;
int uph = (int) random(100, 400);
int pg = 200;
int ly = uph + pg;
int lh;
int pw = 100;
int gh;
int score = 0;
void setup(){
size(600, 600);
lh = height - uph - pg;
gh = height - 20;
}

void draw(){
  background(0, 255, 0);
  tppipes();
  fill(#D30F2C);
  text("Your score is " + score + ".", 100, 50);
  fill(#082AFC);
  noStroke();
  rect(0,gh,width,20);
  hitGround();
fill(0,0,255);
stroke(255, 0, 0);
ellipse(x, y, 100, 100);
y += g;
px-= 2;
if(intersectsPipes()){
exit();
}
}
void mousePressed(){
y -= bv;
 }
 void tppipes(){
   fill(#156F1C);
rect(px, 0, pw, uph);
rect(px, ly, pw, lh);
if(px <= -104){
       uph = (int) random(100, 300);
  px = 600;
   ly = uph + pg;
   lh = height - uph - pg;
   score++;
}

 }
 boolean intersectsPipes() { 
         if (y - 50 < uph && x + 50 > px && x - 50 < (px+pw)){
            return true; 
          }
        else if (y + 50 >ly && x + 50 > px && x - 50 < (px+pw)) {
            return true; 
          }
        else { 
        return false; 
      }
}
void hitGround(){
if(y + 50 > gh){
exit();
}
}
