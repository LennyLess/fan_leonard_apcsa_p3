/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("C:\\Users\\Leonard Fan\\Desktop\\APCSA19 Files\\Unit16Students\\Unit16-Assignments-pixLab\\images\\beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyRed()
  {
    Picture beach = new Picture("C:\\Users\\Leonard Fan\\Desktop\\APCSA19 Files\\Unit16Students\\Unit16-Assignments-pixLab\\images\\beach.jpg");
    beach.explore();
    beach.onlyRed();
    beach.explore();
  }
  
  public static void testNegate() {
    Picture beach = new Picture("C:\\Users\\Leonard Fan\\Desktop\\APCSA19 Files\\Unit16Students\\Unit16-Assignments-pixLab\\images\\beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }
  
  public static void testGrayscale() {
    Picture beach = new Picture("C:\\Users\\Leonard Fan\\Desktop\\APCSA19 Files\\Unit16Students\\Unit16-Assignments-pixLab\\images\\beach.jpg");
    beach.explore();
    beach.grayscale();
    beach.explore();
  }
  
  public static void testFixUnderwater() {
	    Picture beach = new Picture("C:\\Users\\Leonard Fan\\Desktop\\APCSA19 Files\\Unit16Students\\Unit16-Assignments-pixLab\\images\\water.jpg");
	    beach.explore();
	    beach.fixUnderwater();
	    beach.explore();
	  }
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("C:\\Users\\Leonard Fan\\Desktop\\APCSA19 Files\\Unit16Students\\Unit16-Assignments-pixLab\\images\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("C:\\Users\\Leonard Fan\\Desktop\\APCSA19 Files\\Unit16Students\\Unit16-Assignments-pixLab\\images\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  
  public static void testMirrorHorizontal()
  {
    Picture caterpillar = new Picture("C:\\Users\\Leonard Fan\\Desktop\\APCSA19 Files\\Unit16Students\\Unit16-Assignments-pixLab\\images\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }
  
  public static void testMirrorHorizontalBotToTop()
  {
    Picture caterpillar = new Picture("C:\\Users\\Leonard Fan\\Desktop\\APCSA19 Files\\Unit16Students\\Unit16-Assignments-pixLab\\images\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontalBotToTop();
    caterpillar.explore();
  }
  
  public static void testMirrorDiagonal()
  {
    Picture caterpillar = new Picture("C:\\Users\\Leonard Fan\\Desktop\\APCSA19 Files\\Unit16Students\\Unit16-Assignments-pixLab\\images\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorDiagonal();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("C:\\Users\\Leonard Fan\\Desktop\\APCSA19 Files\\Unit16Students\\Unit16-Assignments-pixLab\\images\\temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms()
  {
    Picture arms = new Picture("C:\\Users\\Leonard Fan\\Desktop\\APCSA19 Files\\Unit16Students\\Unit16-Assignments-pixLab\\images\\snowman.jpg");
    arms.explore();
    arms.mirrorArms();
    arms.explore();
  }
  
  public static void testMirrorGull()
  {
    Picture seagull = new Picture("C:\\Users\\Leonard Fan\\Desktop\\APCSA19 Files\\Unit16Students\\Unit16-Assignments-pixLab\\images\\seagull.jpg");
    seagull.explore();
    seagull.mirrorGull();
    seagull.explore();
  }
  
  public static void testCopy()
  {
    Picture flower = new Picture("C:\\Users\\Leonard Fan\\Desktop\\APCSA19 Files\\Unit16Students\\Unit16-Assignments-pixLab\\images\\flower1.jpg");
    flower.explore();
    flower.copy(flower,0,0,30,30);
    flower.explore();
  }
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("C:\\Users\\Leonard Fan\\Desktop\\APCSA19 Files\\Unit16Students\\Unit16-Assignments-pixLab\\images\\640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("C:\\Users\\Leonard Fan\\Desktop\\APCSA19 Files\\Unit16Students\\Unit16-Assignments-pixLab\\images\\swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("C:\\Users\\Leonard Fan\\Desktop\\APCSA19 Files\\Unit16Students\\Unit16-Assignments-pixLab\\images\\swan.jpg");
    swan.edgeDetection2(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
	//testMirrorVerticalRightToLeft();
	//testMirrorHorizontal();
	//testMirrorHorizontalBotToTop();
	//testMirrorDiagonal();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}