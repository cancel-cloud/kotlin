/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.gradle.plugin.mpp.pm20

interface PublicationSetup<in T : KotlinGradleVariant> {
    operator fun invoke(variant: T)

    object NoPublication : PublicationSetup<KotlinGradleVariant> {
        override fun invoke(variant: KotlinGradleVariant) = Unit
    }

    object SingleVariantPublication : PublicationSetup<KotlinGradlePublishedVariantWithRuntime> {
        override fun invoke(variant: KotlinGradlePublishedVariantWithRuntime) {
            VariantPublishingConfigurator.get(variant.project).configureSingleVariantPublication(variant)
        }
    }
}
