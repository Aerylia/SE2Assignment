/* This file is part of Eternity II Editor.
 * 
 * Eternity II Editor is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Eternity II Editor is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Eternity II Editor.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Eternity II Editor project is hosted on SourceForge:
 * http://sourceforge.net/projects/eternityii/
 * and maintained by Yannick Kirschhoffer <alcibiade@alcibiade.org>
 */

package org.alcibiade.eternity.editor.gui.action;

import java.awt.event.ActionEvent;

import org.alcibiade.eternity.editor.gui.EditableStatusProvider;
import org.alcibiade.eternity.editor.gui.GridLocalizable;
import org.alcibiade.eternity.editor.model.GridModel;
import org.alcibiade.eternity.editor.model.QuadModel;

public class SortGridAction extends GridUpdateAction {
	private static final long serialVersionUID = 1L;
	private GridModel gridModel;
	private GridLocalizable gridLocalizer;

	public SortGridAction(GridModel grid, EditableStatusProvider editable, GridLocalizable localizer) {
		super("Sort", editable);
		gridModel = grid;
		gridLocalizer = localizer;
	}

	public void actionPerformed(ActionEvent e) {
		final QuadModel referenceQuad = gridLocalizer.getSelectedQuad();

		BackgroundActionRunner.run(new Runnable() {
			@Override
			public void run() {
				gridModel.sort(referenceQuad);
			}
		});
	}
}
