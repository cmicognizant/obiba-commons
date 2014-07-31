/*******************************************************************************
 * Copyright 2014(c) The OBiBa Consortium. All rights reserved.
 *
 * This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package org.obiba.crypt;

public class ObibaCryptRuntimeException extends RuntimeException {

  public ObibaCryptRuntimeException(String message) {
    super(message);
  }

  public ObibaCryptRuntimeException(String message, Throwable cause) {
    super(message, cause);
  }

  public ObibaCryptRuntimeException(Throwable cause) {
    super(cause);
  }

}