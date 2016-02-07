/*
 * Complete the function below.
 */
  public static HashSet<Integer> keySize = new HashSet<Integer>();
  public static List<Integer> sizeKey = new ArrayList<Integer>();

  static String Decoding(String[] encodings, String encodedstring) {

    HashMap<String, String> dictionary = new HashMap<String, String>();
    int minKeyLength = Integer.MIN_VALUE;
    int maxKeyLenght = Integer.MAX_VALUE;

    for (int i = 0; i < encodings.length; i++) {
      String[] tuple = encodings[i].split("\t");
      keySize.add(tuple[1].length());
      if(tuple[0].contains("newline")){
          tuple[0] = "\n";
      }  
      dictionary.put(tuple[1], tuple[0]);
    }

    sizeKey.addAll(keySize);

    Collections.sort(sizeKey);

    StringBuffer sb = new StringBuffer();

    int i = 0;
    String key = "";
    while (i < encodedstring.length()) {
      for (Integer x : sizeKey) {
        key = encodedstring.substring(i, i + x);
        if (dictionary.containsKey(key)) {
          sb.append(dictionary.get(key));
          i = i + x;
          continue;
        }
      }
    }

    return sb.toString();
  }
