package maintest;

import Facade.FacadeTest;
import LazyLoading.LazyLoadingTest;
import abstractfactory.AbstractFactoryTest;
import activeobject.ActiveObjectTest;
import adapter.AdapterTest;
import balking.BalkingTest;
import bridge.BridgeTest;
import builder.BuilderTest;
import chainofresponsibility.ChainTest;
import command.CommandTest;
import composite.CompositeTest;
import converter.ConverterTest;
import dataaccessobject.DataAccessObjectTest;
import decorator.DecoratorTest;
import delegation.DelegationTest;
import dependencyInjection.DependencyInjectionTest;
import dirtyflag.ElectronicUpdateTest;
import dto.DtoTest;
import factory.FactoryTest;
import featuretoggle.FeatureToggleTest;
import flyweight.FlyWeightTest;
import frontcontroller.FrontControllerTest;
import futurepromise.FuturePromiseTest;
import immutable.ImmutableTest;
import interpreter.InterpreterTest;
import iterator.TouristTest;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;
import markerinterface.MarkerInterfaceTest;
import mediator.MediatorTest;
import memento.MementoTest;
import monostate.BillboardTest;
import multition.MultitionTest;
import mvc.MvcTest;
import nullobject.NullObjectTest;
import objectmother.FacilitiesObjectMotherTest;
import objectpool.ObjectPoolTest;
import observer.ObserverTest;
import pipeline.PipelineTest;
import prototype.PrototypeTest;
import proxy.ProxyTest;
import publishsubscribe.PublishSubscribeTest;
import readwritelock.ReadWriteLockTest;
import singleton.ClockTest;
import specification.SpecificationTest;
import state.StateTest;
import strategy.ExperiencedTouristTest;
import templatemethod.TemplateMethodTest;
import threadpool.ThreadPoolTest;
import transferObject.TransferObjectTest;
import valueobject.ValueObjectTest;
import visitor.VisitorTest;

public class MainTest extends TestCase {

    public static void main(String[] args) {
        TestRunner.run(getAllTest());
    }
    public  static Test getAllTest(){
        TestSuite suite=new TestSuite();
        suite.addTestSuite(AbstractFactoryTest.class);
        suite.addTestSuite(ActiveObjectTest.class);
        suite.addTestSuite(AdapterTest.class);
        suite.addTestSuite(BalkingTest.class);
        suite.addTestSuite(BridgeTest.class);
        suite.addTestSuite(BuilderTest.class);
        suite.addTestSuite(ChainTest.class);
        suite.addTestSuite(CommandTest.class);
        suite.addTestSuite(CompositeTest.class);
        suite.addTestSuite(DataAccessObjectTest.class);
        suite.addTestSuite(DecoratorTest.class);
        suite.addTestSuite(DelegationTest.class);
        suite.addTestSuite(DependencyInjectionTest.class);
        suite.addTestSuite(ElectronicUpdateTest.class);
        suite.addTestSuite(DtoTest.class);
        suite.addTestSuite(FacadeTest.class);
        suite.addTestSuite(FactoryTest.class);
        suite.addTestSuite(FeatureToggleTest.class);
        suite.addTestSuite(FlyWeightTest.class);
        suite.addTestSuite(FrontControllerTest.class);
        suite.addTestSuite(FuturePromiseTest.class);
        suite.addTestSuite(ImmutableTest.class);
        suite.addTestSuite(InterpreterTest.class);
        suite.addTestSuite(TouristTest.class);
        suite.addTestSuite(LazyLoadingTest.class);
        suite.addTestSuite(MediatorTest.class);
        suite.addTestSuite(MementoTest.class);
        suite.addTestSuite(BillboardTest.class);
        suite.addTestSuite(MultitionTest.class);
        suite.addTestSuite(NullObjectTest.class);
        suite.addTestSuite(FacilitiesObjectMotherTest.class);
        suite.addTestSuite(ObserverTest.class);
        suite.addTestSuite(PipelineTest.class);
        suite.addTestSuite(PrototypeTest.class);
        suite.addTestSuite(ProxyTest.class);
        suite.addTestSuite(PublishSubscribeTest.class);
        suite.addTestSuite(ReadWriteLockTest.class);
        suite.addTestSuite(SpecificationTest.class);
        suite.addTestSuite(ClockTest.class);
        suite.addTestSuite(SpecificationTest.class);
        suite.addTestSuite(ExperiencedTouristTest.class);
        suite.addTestSuite(StateTest.class);
        suite.addTestSuite(TemplateMethodTest.class);
        suite.addTestSuite(ThreadPoolTest.class);
        suite.addTestSuite(TransferObjectTest.class);
        suite.addTestSuite(VisitorTest.class);
        suite.addTestSuite(ValueObjectTest.class);
        suite.addTestSuite(ConverterTest.class);
        suite.addTestSuite(ObjectPoolTest.class);
        suite.addTestSuite(MarkerInterfaceTest.class);
        suite.addTestSuite(MvcTest.class);
        return suite;
    }
    public void test(){

    }
}
