/**
 * Copyright © 2014 Instituto Superior Técnico
 *
 * This file is part of FenixEdu Identification Cards.
 *
 * FenixEdu Identification Cards is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * FenixEdu Identification Cards is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with FenixEdu Identification Cards.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.fenixedu.idcards.ui;

import java.io.Serializable;

import org.fenixedu.academic.domain.ExecutionYear;

public class CardGenerationContext implements Serializable {

    private ExecutionYear executionYear;

    public CardGenerationContext() {
        executionYear = executionYearDR(ExecutionYear.readCurrentExecutionYear());
    }

    public CardGenerationContext(final ExecutionYear executionYear) {
        setExecutionYear(executionYear);
    }

    public ExecutionYear getExecutionYear() {
        return executionYear;
    }

    public void setExecutionYear(final ExecutionYear executionYear) {
        this.executionYear = executionYearDR(executionYear);
    }

    private ExecutionYear executionYearDR(final ExecutionYear executionYear) {
        return executionYear;
    }

}
