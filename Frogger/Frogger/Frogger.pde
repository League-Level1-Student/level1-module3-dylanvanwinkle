int x = 100;
int y = 100;
int fh = 10;
void setup(){
size(800, 600);
}

void draw(){
background(#050505);
fill(#18A203);
ellipse(x, y, 40, 40);
}
void keyPressed()
{
print("");
    if(key == CODED){
        if(keyCode == UP)
        {
            //Frog Y position goes up
            y-= 5;
        }
        else if(keyCode == DOWN)
        {
            //Frog Y position goes down
            y+= 5;
        }
        else if(keyCode == RIGHT)
        {
            //Frog X position goes right
            x+= 5;
        }
        else if(keyCode == LEFT)
        {
            //Frog X position goes left
            x-= 5;
        }
    }
}
