public class PhraseOMatic {
  public static void main (String[] args) {
    String[] wordListOne = {"24/7", "multi-Tier", "30,000 foot", "B-to-B", "win-win", "front-end", "web-based", "pervasive", "smart", "six-sigma", "critical-path", "dynamic"};
    String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed", "clustered", "branded", "outside-the-box", "positioned", "networked", "focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated"};
    String[] wordListThree = {"process", "tipping-point", "solution", "architecture", "core competancy", "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission"};
    //find out how many words are in each list
    int onelength = wordListOne.length;
    int twolength = wordListTwo.length;
    int threelength = wordListThree.length;

    // generate three random numbers
    int rand1 = (int) (Math.random() * onelength);
    int rand2 = (int) (Math.random() * twolength);
    int rand3 = (int) (Math.random() * threelength);

    //now build a Phrase
    String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
    System.out.println("What we need is a " + phrase);
  }
}
