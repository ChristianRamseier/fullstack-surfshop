package com.surfshop

import com.tngtech.archunit.junit.AnalyzeClasses
import com.tngtech.archunit.junit.ArchTest
import com.tngtech.archunit.lang.ArchRule
import org.jmolecules.archunit.JMoleculesArchitectureRules
import org.jmolecules.archunit.JMoleculesDddRules

@AnalyzeClasses(packages = arrayOf("com.surfshop"))
internal class ArchitectureTest {

    @ArchTest
    var dddRules: ArchRule = JMoleculesDddRules.all()

    @ArchTest
    var layering: ArchRule = JMoleculesArchitectureRules.ensureLayering()

}
