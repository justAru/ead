package VisitorProxy;

import Command.Gallery;
import FactoryMethodFlyweight.*;

import java.util.ArrayList;

/**
 * Class for collection of paintings as a hall of impressionism style 
 * implements ItemsCollection interface
 * with array list with paintings
 * @author Dyachuk Roksolana
 *
 */
public class ImpressionismCollection implements ItemsCollection{

	ArrayList<ImpressionismPainting> impressionism_hall;
	Gallery gallery;
	public ImpressionismCollection()
	{
		gallery = new Gallery();
		impressionism_hall = new ArrayList<>();
	}

	/**
	 * Accept visitor
	 */
	@Override
	public String accept(GalleryVisitor visitor) 
	{
		return visitor.visit(this);
	}

	/**
	 * Add impressionism paintings to the Array List 
	 * and output them
	 */
	@Override
	public void addItems() 
	{
		impressionism_hall.add(new MonetPainting());
		impressionism_hall.add(new CezannePainting());
		impressionism_hall.add(new DegasPainting());
		impressionism_hall.add(new RenoirPainting());
		impressionism_hall.add(new SisleyPainting());
		impressionism_hall.add(new PissaroPainting());
		
		for(ImpressionismPainting p: impressionism_hall)
		{
			System.out.println(p.toString());
		}
	}
}
