class ResistorColor {

    int colorCode(String color) {
        return findIndexOfColor(color);
    }

    private int findIndexOfColor(String color) {
        String[] colors = colors();
        for(int index=0; index<colors.length; index++) {
            if(color.equals(colors[index]))
                return index;
        }
        return -1;
    }

    String[] colors() {
        return "black brown red orange yellow green blue violet grey white".split(" ");
    }
}
