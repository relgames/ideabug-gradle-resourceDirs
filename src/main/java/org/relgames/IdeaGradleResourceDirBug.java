package org.relgames;

/**
 * @author opoleshuk
 */
public class IdeaGradleResourceDirBug {
    public static void main(String[] args) {
        System.out.println(IdeaGradleResourceDirBug.class.getClassLoader().getResourceAsStream("1.txt"));
    }
}
