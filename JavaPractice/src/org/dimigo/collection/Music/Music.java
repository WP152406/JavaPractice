/**
 * 
 */
package org.dimigo.collection.Music;

/**
 * <pre>
 * org.dimigo.collection.Music
 *    |_Music.java
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 6. 5.
 *</pre>
 *
 * @author : kimseongsu
 * @ver : 1.0
 */
public class Music {
	   private String title;
	   private String singer;
	   
	   public Music(String title, String singer) {
	      this.title = title; this.singer = singer;
	   }
	   
	   public String getTitle() { return title; }
	   public String getSinger() { return singer; }
	   public void setSinger(String singer) { this.singer = singer; }
	   public void setTitle(String title) { this.title = title; }
	   public String toString() { return title + " (" + singer + ")"; } 
	}