package _3_enumeration;

public class SizeIterator {

	  public static void main(String[] args) {
	    Size[] sizes = Size.values();
	    for (Size s : sizes) {
	      System.out.println(s);
	    }
	  }
	}

	enum Size implements Countable {
	  S, M, L, XL, XXL, XXXL;
	  @Deprecated
	  public Size increase() {
	    Size sizes[] = this.values();
	    int pos = this.ordinal();
	    if (pos < sizes.length - 1)
	      pos++;
	    return sizes[pos];
	  }
	}

	interface Countable {
	  public Size increase();
	}