import processing.core.PApplet;

/**
* A program Sketch.java that draws 8 quadrants consisting of squares in different patterns and colours.
* @author: H. Rahukulan
* 
*/

public class Sketch extends PApplet {

  public void settings() {
    // Size
    size(1200, 600);
  }

  /**
   * Called once at the beginning of execution. Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(45, 150, 207);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();

    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();
  }

  /**
   * Draw the outlines for all sections
   */
  public void draw_section_outlines() {
    stroke(0);
    noFill();

    // Draw bottom row boxes
    rect(0, 300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // Draw top row boxes
    rect(0, 0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }

  // Section 1
  public void draw_section1() {
    int intX = 0;
    int intY = 0;

    for (int intRow = 0; intRow < 30; intRow++) {
      for (int intColumn = 0; intColumn < 30; intColumn++) {
        intX = 3 + intRow * 10;
        intY = 300 + 3 + intColumn * 10;

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  // Section 2
  public void draw_section2() {
    int intX = 0;
    int intY = 0;

    for (int intRow = 0; intRow < 30; intRow++) {
      for (int intColumn = 0; intColumn < 30; intColumn++) {
        intX = 3 + 300 + intRow * 10;
        intY = 300 + 3 + intColumn * 10;
        
        if (intRow % 2 == 0) {
          fill(255);
        }
        else {
          fill(0);
        }
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  // Section 3
  public void draw_section3() {
    int intX = 0;
    int intY = 0;

    for (int intRow = 0; intRow < 30; intRow++) {
      for (int intColumn = 0; intColumn < 30; intColumn++) {
        intX = 3 + 300 + 300 + intRow * 10;
        intY = 300 + 3 + intColumn * 10;

        if (intColumn % 2 == 0) {
          fill(0);
        }
        else {
          fill(255);
        }
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  // Section 4
  public void draw_section4() {
    int intX = 0;
    int intY = 0;

    for (int intRow = 0; intRow < 30; intRow++) {
      for (int intColumn = 0; intColumn < 30; intColumn++) {
        intX = 3 + 300 + 300 + 300 + intRow * 10;
        intY = 300 + 3 + intColumn * 10;

        if (intColumn % 2 == 1 && intRow % 2 == 0) {
          fill(255);
        }
        else {
          fill(0);
        }
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  // Section 5
  public void draw_section5() {
    int intX = 0;
    int intY = 0;

    for (int intRow = 0; intRow < 30; intRow++) {
      for (int intColumn = 0; intColumn < intRow; intColumn++) {
        intX = 3 + intRow * 10;
        intY = 3 + intColumn * 10;

        fill(255);
        noStroke();
        rect(intX , 296 - intY, 5, 5);
      }
    }
  }

  // Section 6
  public void draw_section6() {
    int intX = 0;
    int intY = 0;

    for (int intRow = 0; intRow < 30; intRow++) {
      for (int intColumn = 0; intColumn <= intRow; intColumn++) {
        intX = 3 + intRow * 10;
        intY = 3 + 300 + intColumn * 10;

        fill(255);
        noStroke();
        rect(intY, intX, 5, 5);
      }
    }
  }

  // Section 7
  public void draw_section7() {
    int intX = 0;
    int intY = 0;

    for (int intRow = 0; intRow < 30; intRow++) {
      for (int intColumn = 0; intColumn <= intRow; intColumn++) {
        intX = 3 + 890 - intRow * 10;
        intY = 3 + intColumn * 10;

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  // Section 8
  public void draw_section8() {
    int intX = 0;
    int intY = 0;

    for (int intRow = 0; intRow < 30; intRow++) {
      for (int intColumn = 0; intColumn <= intRow; intColumn++) {
        intX = 3 + 900 + intRow * 10;
        intY = 3 + intColumn * 10;

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

}