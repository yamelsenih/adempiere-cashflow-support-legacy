/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) e-Evolution Consultants All Rights Reserved.                 *
 * This program is free software; you can redistribute it and/or              *
 * modify it under the terms of the GNU General Public License                *
 * as published by the Free Software Foundation; either version 2             *
 * of the License, or (at your option) any later version.                     *
 * This program is distributed in the hope that it will be useful,            *
 * but WITHOUT ANY WARRANTY; without even the implied warranty of             *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.                       *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 *                                                                            *
 * @author victor.perez@e-evolution.com, www.e-evolution.com                  *
 * http://adempiere.atlassian.net/browse/ADEMPIERE-199 Cashflow Management    *
 *****************************************************************************/
package org.eevolution.model;

import java.sql.ResultSet;
import java.util.Properties;

/**
 * Class Model for Cashflow Management
 * 
 * @author victor.perez@e-evoluton.com, e-Evolution Consultants
 * 
 */
public class MCashFlow extends org.eevolution.cashflow.model.MCashFlow  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8923063222873086089L;

	public MCashFlow(Properties ctx, int C_CashFlow_ID, String trxName) {
		super(ctx, C_CashFlow_ID, trxName);
	}

	public MCashFlow(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}
}
