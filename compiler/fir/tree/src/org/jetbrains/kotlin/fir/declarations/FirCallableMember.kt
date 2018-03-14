/*
 * Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir.declarations

import org.jetbrains.kotlin.fir.VisitedSupertype
import org.jetbrains.kotlin.fir.types.FirType

// Good name needed (something with receiver, type parameters, return type, and name)
interface FirCallableMember : @VisitedSupertype FirDeclaration, FirMemberDeclaration, FirTypedDeclaration {
    val receiverType: FirType?
}