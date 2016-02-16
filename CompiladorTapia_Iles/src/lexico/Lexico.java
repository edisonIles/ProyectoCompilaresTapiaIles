

// ************  C�digo a incluir ********************

package lexico;
import sintactico.Parser;

import ast.*;




public class Lexico {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\10\1\6\1\0\1\10\1\5\22\0\1\10\1\31\3\0"+
    "\1\15\1\26\1\16\1\52\1\53\1\7\1\20\1\15\1\14\1\11"+
    "\1\4\12\1\1\22\1\15\1\32\1\30\1\33\1\21\1\0\4\2"+
    "\1\13\20\2\1\23\4\2\1\15\1\17\1\15\3\0\1\35\1\47"+
    "\1\50\1\36\1\12\1\43\1\2\1\41\1\40\2\2\1\42\1\51"+
    "\1\24\1\45\2\2\1\34\1\44\1\25\1\46\1\54\1\37\3\2"+
    "\1\15\1\27\1\15\103\0\1\3\7\0\1\3\3\0\1\3\3\0"+
    "\1\3\1\0\1\3\6\0\1\3\6\0\1\3\7\0\1\3\3\0"+
    "\1\3\3\0\1\3\1\0\1\3\6\0\1\3\uff05\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\1\1\5\1\4"+
    "\1\3\1\4\1\1\1\4\1\6\1\7\2\1\4\4"+
    "\10\3\1\10\3\0\1\3\1\11\3\0\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\5\3\1\21\4\3"+
    "\1\10\1\0\1\5\1\0\1\3\1\22\3\0\1\23"+
    "\5\3\1\24\4\3\1\25\1\26\1\27\1\30\1\3"+
    "\1\31\4\3\1\32\1\3\1\33\2\3\1\34\1\35"+
    "\1\3\1\0\1\36\1\37\1\40\1\41";

  private static int [] zzUnpackAction() {
    int [] result = new int[97];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\55\0\132\0\207\0\264\0\341\0\55\0\55"+
    "\0\u010e\0\u013b\0\u0168\0\u0195\0\55\0\55\0\u01c2\0\u01ef"+
    "\0\u021c\0\u0249\0\u0276\0\u02a3\0\u02d0\0\u02fd\0\u032a\0\u0357"+
    "\0\u0384\0\u03b1\0\u03de\0\u040b\0\u0438\0\u0465\0\u0492\0\u04bf"+
    "\0\u04ec\0\55\0\u0519\0\u0546\0\u0573\0\55\0\55\0\55"+
    "\0\55\0\55\0\55\0\55\0\u05a0\0\u05cd\0\u05fa\0\u0627"+
    "\0\u0654\0\207\0\u0681\0\u06ae\0\u06db\0\u0708\0\u0735\0\u0735"+
    "\0\341\0\u0762\0\u078f\0\55\0\u07bc\0\u07e9\0\u0816\0\55"+
    "\0\u0843\0\u0870\0\u089d\0\u08ca\0\u08f7\0\207\0\u0924\0\u0951"+
    "\0\u097e\0\u09ab\0\207\0\55\0\55\0\55\0\u09d8\0\207"+
    "\0\u0a05\0\u0a32\0\u0a5f\0\u0a8c\0\207\0\u0ab9\0\207\0\u0ae6"+
    "\0\u0b13\0\207\0\207\0\u0b40\0\u0b6d\0\207\0\207\0\207"+
    "\0\55";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[97];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\2\1\5\1\6\1\7\1\10"+
    "\1\7\1\10\1\11\1\4\1\12\1\10\1\13\1\2"+
    "\1\14\1\15\1\16\3\4\1\17\1\20\1\21\1\22"+
    "\1\23\1\24\1\25\1\4\1\26\1\27\1\30\3\4"+
    "\1\31\3\4\1\32\1\33\2\10\1\34\56\0\1\3"+
    "\7\0\1\35\2\36\42\0\3\4\6\0\2\4\7\0"+
    "\3\4\6\0\16\4\2\0\1\4\4\0\1\37\2\0"+
    "\1\40\53\0\1\7\47\0\3\4\6\0\2\4\7\0"+
    "\3\4\6\0\6\4\1\41\7\4\2\0\1\4\14\0"+
    "\1\42\40\0\6\43\1\0\10\43\1\44\3\43\1\45"+
    "\31\43\20\0\1\46\62\0\1\47\55\0\1\50\55\0"+
    "\1\51\54\0\1\52\54\0\1\53\54\0\1\54\25\0"+
    "\3\4\6\0\1\55\1\4\7\0\3\4\6\0\16\4"+
    "\2\0\1\4\1\0\3\4\6\0\2\4\7\0\3\4"+
    "\6\0\11\4\1\56\4\4\2\0\1\4\1\0\3\4"+
    "\6\0\2\4\7\0\3\4\6\0\1\57\4\4\1\60"+
    "\10\4\2\0\1\4\1\0\3\4\6\0\2\4\7\0"+
    "\1\4\1\61\1\4\6\0\7\4\1\62\6\4\2\0"+
    "\1\4\1\0\3\4\6\0\2\4\7\0\2\4\1\63"+
    "\6\0\16\4\2\0\1\4\1\0\3\4\6\0\2\4"+
    "\7\0\3\4\6\0\5\4\1\64\10\4\2\0\1\4"+
    "\1\0\3\4\6\0\2\4\7\0\3\4\6\0\1\4"+
    "\1\65\14\4\2\0\1\4\1\0\3\4\6\0\2\4"+
    "\7\0\3\4\6\0\11\4\1\66\4\4\2\0\1\4"+
    "\1\0\1\35\10\0\2\36\42\0\1\67\12\0\1\70"+
    "\3\0\1\70\34\0\5\37\1\71\1\7\46\37\7\40"+
    "\1\72\45\40\1\0\3\4\6\0\2\4\7\0\3\4"+
    "\6\0\10\4\1\73\5\4\2\0\1\4\16\0\1\74"+
    "\37\0\1\75\14\0\1\74\5\0\1\76\1\77\45\0"+
    "\1\100\37\0\3\4\6\0\2\4\7\0\2\4\1\101"+
    "\6\0\1\4\1\102\14\4\2\0\1\4\1\0\3\4"+
    "\6\0\2\4\7\0\3\4\6\0\12\4\1\103\3\4"+
    "\2\0\1\4\1\0\3\4\6\0\2\4\7\0\3\4"+
    "\6\0\4\4\1\104\11\4\2\0\1\4\1\0\3\4"+
    "\6\0\2\4\7\0\3\4\6\0\4\4\1\105\11\4"+
    "\2\0\1\4\1\0\3\4\6\0\2\4\7\0\2\4"+
    "\1\106\6\0\16\4\2\0\1\4\1\0\3\4\6\0"+
    "\2\4\7\0\3\4\6\0\1\107\15\4\2\0\1\4"+
    "\1\0\3\4\6\0\2\4\7\0\3\4\6\0\1\4"+
    "\1\110\14\4\2\0\1\4\1\0\3\4\6\0\2\4"+
    "\7\0\3\4\6\0\4\4\1\111\11\4\2\0\1\4"+
    "\1\0\3\4\6\0\2\4\7\0\3\4\6\0\4\4"+
    "\1\112\11\4\2\0\1\4\1\0\1\67\53\0\4\40"+
    "\1\7\2\40\1\72\45\40\1\0\3\4\6\0\1\113"+
    "\1\4\7\0\3\4\6\0\16\4\2\0\1\4\1\0"+
    "\1\75\14\0\1\114\54\0\1\115\54\0\1\116\37\0"+
    "\3\4\6\0\2\4\7\0\3\4\6\0\12\4\1\117"+
    "\3\4\2\0\1\4\1\0\3\4\6\0\2\4\7\0"+
    "\3\4\6\0\2\4\1\120\13\4\2\0\1\4\1\0"+
    "\3\4\6\0\2\4\7\0\3\4\6\0\13\4\1\121"+
    "\2\4\2\0\1\4\1\0\3\4\6\0\2\4\7\0"+
    "\2\4\1\122\6\0\16\4\2\0\1\4\1\0\3\4"+
    "\6\0\2\4\7\0\3\4\6\0\6\4\1\123\7\4"+
    "\2\0\1\4\1\0\3\4\6\0\2\4\7\0\3\4"+
    "\6\0\12\4\1\124\3\4\2\0\1\4\1\0\3\4"+
    "\6\0\2\4\7\0\3\4\6\0\1\125\15\4\2\0"+
    "\1\4\1\0\3\4\6\0\2\4\7\0\1\4\1\126"+
    "\1\4\6\0\16\4\2\0\1\4\1\0\3\4\6\0"+
    "\2\4\7\0\3\4\6\0\2\4\1\127\13\4\2\0"+
    "\1\4\1\0\3\4\6\0\2\4\7\0\3\4\6\0"+
    "\1\130\15\4\2\0\1\4\1\0\3\4\6\0\2\4"+
    "\7\0\3\4\6\0\6\4\1\131\7\4\2\0\1\4"+
    "\1\0\3\4\6\0\1\132\1\4\7\0\3\4\6\0"+
    "\16\4\2\0\1\4\1\0\3\4\6\0\1\133\1\4"+
    "\7\0\3\4\6\0\16\4\2\0\1\4\1\0\3\4"+
    "\6\0\2\4\7\0\3\4\6\0\14\4\1\134\1\4"+
    "\2\0\1\4\1\0\3\4\6\0\2\4\7\0\3\4"+
    "\6\0\16\4\1\135\1\0\1\4\1\0\3\4\6\0"+
    "\2\4\7\0\1\4\1\136\1\4\6\0\16\4\2\0"+
    "\1\4\1\0\3\4\6\0\1\137\1\4\7\0\3\4"+
    "\6\0\16\4\2\0\1\4\1\0\3\4\6\0\2\4"+
    "\7\0\2\4\1\140\6\0\16\4\2\0\1\4\53\0"+
    "\1\141\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2970];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\4\1\2\11\4\1\2\11\17\1\3\0"+
    "\1\1\1\11\3\0\7\11\13\1\1\0\1\1\1\0"+
    "\1\1\1\11\3\0\1\11\13\1\3\11\16\1\1\0"+
    "\3\1\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[97];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
// ************  Atributos y m�todos ********************
// * El analizador sint�ctico
private Parser parser;
public void setParser(Parser parser) {
	this.parser=parser;
}

// * Para acceder al n�mero de l�nea (yyline es package)
public int getYyline() { 
	// * Flex empieza en cero
	return yyline+1;
}

// * Para acceder al n�mero de columna (yycolumn es package)
public int getYycolumn() { 
	// * Flex empieza en cero
	return yycolumn+1;
}



  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexico(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Lexico(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 176) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzPushbackPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead < 0) {
      return true;
    }
    else {
      zzEndRead+= numRead;
      return false;
    }
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = zzPushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = zzLexicalState;


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 4: 
          { parser.setYylval(yytext());
					  return yytext().charAt(0);
          }
        case 34: break;
        case 12: 
          { parser.setYylval(yytext());
					  return Parser.O;
          }
        case 35: break;
        case 30: 
          { parser.setYylval(yytext());
					  return Parser.RETURN;
          }
        case 36: break;
        case 19: 
          { parser.setYylval(new Character('~'));
                      return Parser.CTE_CARACTER;
          }
        case 37: break;
        case 7: 
          { parser.setYylval(yytext());
					  return Parser.DOSPUNTOS;
          }
        case 38: break;
        case 23: 
          { parser.setYylval(new Character('\n'));
                      return Parser.CTE_CARACTER;
          }
        case 39: break;
        case 8: 
          { parser.setYylval(new Double(yytext()));
					  return Parser.CTE_REAL;
          }
        case 40: break;
        case 20: 
          { parser.setYylval(yytext());
					  return Parser.INT;
          }
        case 41: break;
        case 10: 
          { parser.setYylval(yytext());
					  return Parser.MASMAS;
          }
        case 42: break;
        case 26: 
          { parser.setYylval(yytext());
					  return Parser.CHAR;
          }
        case 43: break;
        case 13: 
          { parser.setYylval(yytext());
					  return Parser.IGUALDAD;
          }
        case 44: break;
        case 25: 
          { parser.setYylval(yytext());
					  return Parser.READ;
          }
        case 45: break;
        case 24: 
          { parser.setYylval(new Character('\t'));
                      return Parser.CTE_CARACTER;
          }
        case 46: break;
        case 3: 
          { parser.setYylval (yytext());
					  return Parser.ID;
          }
        case 47: break;
        case 32: 
          { parser.setYylval(yytext());
					  return Parser.STRUCT;
          }
        case 48: break;
        case 11: 
          { parser.setYylval(yytext());
					  return Parser.Y;
          }
        case 49: break;
        case 17: 
          { parser.setYylval(yytext());
					  return Parser.IF;
          }
        case 50: break;
        case 6: 
          { parser.setYylval(yytext());
					  return Parser.INTERROG;
          }
        case 51: break;
        case 9: 
          { parser.setYylval(yytext());
					  return Parser.MENOSMENOS;
          }
        case 52: break;
        case 28: 
          { parser.setYylval(yytext());
					  return Parser.WRITE;
          }
        case 53: break;
        case 22: 
          { parser.setYylval(new Character((char)Integer.parseInt(yytext().substring(2,yytext().length()-1))));
						return Parser.CTE_CARACTER;
          }
        case 54: break;
        case 33: 
          { parser.setYylval(yytext());
					  return Parser.MAIN;
          }
        case 55: break;
        case 18: 
          { parser.setYylval(new Character(yytext().charAt(1)));
                      return Parser.CTE_CARACTER;
          }
        case 56: break;
        case 2: 
          { parser.setYylval(new Integer(yytext()));
         			  return Parser.CTE_ENTERA;
          }
        case 57: break;
        case 31: 
          { parser.setYylval(yytext());
					  return Parser.DOUBLE;
          }
        case 58: break;
        case 15: 
          { parser.setYylval(yytext());
					  return Parser.MENORIGUAL;
          }
        case 59: break;
        case 21: 
          { parser.setYylval(yytext());
					  return Parser.ELSE;
          }
        case 60: break;
        case 1: 
          { new TipoError("Error L�xico en l�nea"  + this.getYyline() + " y columna " + this.getYycolumn() + ":\n\tCar�cter \'" + yycharat(0) + "\' desconocido.", new TipoError());
          }
        case 61: break;
        case 27: 
          { parser.setYylval(yytext());
					  return Parser.VOID;
          }
        case 62: break;
        case 16: 
          { parser.setYylval(yytext());
					  return Parser.MAYORIGUAL;
          }
        case 63: break;
        case 14: 
          { parser.setYylval(yytext());
					  return Parser.DISTINTO;
          }
        case 64: break;
        case 29: 
          { parser.setYylval(yytext());
					  return Parser.WHILE;
          }
        case 65: break;
        case 5: 
          { 
          }
        case 66: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return 0; }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}