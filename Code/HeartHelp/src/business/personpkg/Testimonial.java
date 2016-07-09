/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.personpkg;

/**
 *
 * @author tejageetla
 */
public class Testimonial {
    
    private static int count=0;
    private int testimonialID;
    private String testimonialTxt;
    private String writerName;
    private String date;
    
    public Testimonial()
    {
        count++;
       testimonialID = count;
    }

    public int getTestimonialID() {
        return testimonialID;
    }


    public String getTestimonialTxt() {
        return testimonialTxt;
    }

    public void setTestimonialTxt(String testimonialTxt) {
        this.testimonialTxt = testimonialTxt;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return String.valueOf(this.testimonialID);
    }
    
    
    
}
