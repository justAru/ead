package VisitorProxy;

import AbstractFactory.*;

import java.util.ArrayList;

/**
 * Class for collection of paintings as a hall of high renaissance style
 * implements ItemsCollection interface
 * with array list with paintings
 * @author Dyachuk Roksolana
 *
 */
public class HighRenaissanceCollection implements ItemsCollection{
	
	ArrayList<HighRenaissancePainting> renaissance_hall;
	
	public HighRenaissanceCollection()
	{
		renaissance_hall = new ArrayList<>();
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
	 * Add high renaissance paintings to the Array List 
	 * and output them
	 */
	@Override
	public void addItems() 
	{
		renaissance_hall.add(new BartolomeoPainting());
		renaissance_hall.add(new RafaelPainting());
		renaissance_hall.add(new CoreggioPainting());
		renaissance_hall.add(new AlbertinelliPainting());
		renaissance_hall.add(new TizianoPainting());
		for(HighRenaissancePainting p: renaissance_hall)
		{
			System.out.println(p.getDescription());
		}
	}

}
