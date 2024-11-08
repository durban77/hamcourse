public class AprsPasscode {
  public static void main(String[] args) {
    if (args.length < 1) {
      System.out.println("Usage: AprsPasscode <callsign>");
      System.exit(1);
    }
    for (int i = 0; i < args.length; i++) {
      System.out.println("" + args[i] + " " + aprspass(args[i]));
    }
  }
  private static int aprspass(String callsign) {
    String callsignBase = java.text.Normalizer.normalize(callsign, java.text.Normalizer.Form.NFD)
            .replaceAll("-.*","")
            .replaceAll("[^\\x00-\\x7F]", "")
            .toUpperCase();
    char[] csb = new char[10];
    System.arraycopy(callsignBase.toCharArray(), 0, csb, 0, callsignBase.length());
    int hash = 0x73e2;
    for (int i = 0; i < 10; i += 2) {
      hash ^= csb[i] << 8;
      hash ^= csb[i+1];
    }
    return hash & 0x7fff;
  }
}
