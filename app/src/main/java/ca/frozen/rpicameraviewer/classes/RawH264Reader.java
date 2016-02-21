// Copyright © 2016 Shawn Baker using the MIT License.
package ca.frozen.rpicameraviewer.classes;

public class RawH264Reader
{
	// instance variables
	protected Source source;

	//******************************************************************************
	// RawH264Reader
	//******************************************************************************
	public RawH264Reader(Source source)
	{
		this.source = source;
	}

	//******************************************************************************
	// read
	//******************************************************************************
	public int read(byte[] buffer)
	{
		return 0;
	}

	//******************************************************************************
	// isConnected
	//******************************************************************************
	public boolean isConnected()
	{
		return false;
	}

	//******************************************************************************
	// close
	//******************************************************************************
	public void close()
	{
	}
}
